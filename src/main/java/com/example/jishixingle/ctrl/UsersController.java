package com.example.jishixingle.ctrl;

import com.example.jishixingle.dao.BookDAO;
import com.example.jishixingle.dao.CartDAO;
import com.example.jishixingle.dao.ClassificationDAO;
import com.example.jishixingle.dao.UsersDAO;
import com.example.jishixingle.model.Book;
import com.example.jishixingle.model.Cart;
import com.example.jishixingle.model.Classification;
import com.example.jishixingle.model.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("users")
public class UsersController {

    //自动注入
    @Autowired
    private UsersDAO usersDAO;

    @Autowired
    private ClassificationDAO classificationDAO;

    @Autowired
    BookDAO bookDAO;

    @Autowired
    CartDAO cartDAO;


    @RequestMapping("/login")
    public String gologin(Users users, Model model, HttpSession session){
        //查看是否查到数据
        Users us = usersDAO.userslogin(users);
//        System.out.println(us);
        if(us != null){
            //登录主页
            List<Classification> classificationList = classificationDAO.selectClassificationAll();
            model.addAttribute("classificationList",classificationList);
            //设置保存登录用户，保证全局可用
            session.setAttribute("users",us);
            return "index";
        }else {
            //返回失败页面
//            return "fail";
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }

    //回到主页
    @RequestMapping("/home")
    public String getAllBook(Model model,@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
                               @RequestParam(defaultValue = "4", value = "pageSize") Integer pageSize){
        List<Classification> classificationList = classificationDAO.selectClassificationAll();
        model.addAttribute("classificationList",classificationList);
        //开启分页
        PageHelper.startPage(pageNum,pageSize);
        List<Book> bookList = bookDAO.selectBookAll();
        model.addAttribute("bookList",bookList);
        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        model.addAttribute("pageInfo",pageInfo);
//        System.out.println("总条数" + pageInfo.getTotal());
//        System.out.println("总页码" + pageInfo.getPages());
//        System.out.println("当前页的记录" + pageInfo.getList());

        return "product_list";
    }

    @RequestMapping("/classification")
    public String getBookClassification(Model model,HttpServletRequest request,@RequestParam(required = false, defaultValue = "1", value = "pageNum") Integer pageNum,
                               @RequestParam(defaultValue = "4", value = "pageSize") Integer pageSize){

        List<Classification> classificationList = classificationDAO.selectClassificationAll();
        model.addAttribute("classificationList",classificationList);
        //开启分页
        PageHelper.startPage(pageNum,pageSize);
        int classification_id = Integer.parseInt(request.getParameter("classification_id"));
//        System.out.println(classification_id);
        List<Book> bookList = bookDAO.selectBookClassification_id(classification_id);
        model.addAttribute("bookList",bookList);
        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        model.addAttribute("pageInfo",pageInfo);

        return "product_list";
    }

    //前端url跳转
    @RequestMapping(value = "/tourl" , method = RequestMethod.GET)
    public String tourl(HttpServletRequest request, Model model, HttpSession session){
        String url = request.getParameter("url");
        System.out.println(url);
        Users users = (Users) session.getAttribute("users");
        model.addAttribute("users", users);
        List<Classification> classificationList = classificationDAO.selectClassificationAll();
        List<Book> bookList = bookDAO.selectBookAll();
        model.addAttribute("classificationList",classificationList);
        model.addAttribute("bookList",bookList);
        //查询订单全部信息放到前端显示
        List<Cart> cartList = cartDAO.selectCartAll();
        model.addAttribute("cartList", cartList);
        //总计
        double cart_count  = 0;
        for(Cart carts : cartList){
            cart_count += carts.getCart_num();
        }
        model.addAttribute("cart_count", String.format("%.2f", cart_count));

//        System.out.println(url);
        return url;
    }


    //插入新用户
    @RequestMapping("/register")
    public String register(Users users ,Model model){
//        System.out.println(users.getEmail());
//        System.out.println(users.getUname());
//        System.out.println(users.getUpass());
//        System.out.println(users.getSex());
//        System.out.println(users.getIphone());
//        System.out.println(users.getFhdz());
//        System.out.println(users.getMbwt());
//        System.out.println(users.getDaan());
//        System.out.println(users.getByyx());

        boolean b = usersDAO.InsertUser(users);
        if(b){
            return "registersuccess";
        }else {
//            return "fail";
            model.addAttribute("msg","注册失败，请重新注册");
            return "register";
        }


    }

    //查询单本书详细信息然后跳转到书本详情页面
    @RequestMapping("/selectBookOne")
    public String selectBookOne(HttpServletRequest request , Model model){
        List<Classification> classificationList = classificationDAO.selectClassificationAll();
        model.addAttribute("classificationList",classificationList);
        int book_id = Integer.parseInt(request.getParameter("book_id"));
        Book book = bookDAO.selectBookOne(book_id);
//        System.out.println(book.getBook_img());
        model.addAttribute("book" , book);

        return "info";
    }

    @RequestMapping("/selectCart")
    public String selectCart(Model model , HttpServletRequest request , HttpSession session){
        //显示分类列表
        List<Classification> classificationList = classificationDAO.selectClassificationAll();
        model.addAttribute("classificationList",classificationList);
        //取到书本信息
        int book_id_id = Integer.parseInt(request.getParameter("book_id"));
        System.out.println(book_id_id);
        Book book = bookDAO.selectBookOne(book_id_id);
        //取到用户
        Users users = (Users) session.getAttribute("users");
        //插入订单表
        String cart_name = book.getBook_name();
        double cart_scj = book.getBook_yj();
        double cart_yhj = book.getBook_price();
        int num = 1;
        double cart_num = num * book.getBook_price();
        String shdz = users.getShdz();
        String shr = users.getUname();
        String iphone = users.getIphone();
        //生成当前时间
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(date));
//        String cart_date = simpleDateFormat.format(date);
//        //生成随机数，当作订单号
//        int i = (int) ((Math.random()*9+1)*10000);
//        int cart_ordernumber = i ;
        int book_id = book.getBook_id();
        int id = users.getId();
        Cart cart = new Cart(0,cart_name,cart_scj,cart_yhj,num,cart_num,shdz,shr,iphone,book_id,id);
        System.out.println(cart.getCart_name());
        boolean b = cartDAO.updateCartOne(cart);

        //查询订单全部信息放到前端显示
        List<Cart> cartList = cartDAO.selectCartAll();
        model.addAttribute("cartList", cartList);

        //总计
        double cart_count  = 0;
        for(Cart carts : cartList){
            cart_count += carts.getCart_num();
        }
        model.addAttribute("cart_count", String.format("%.2f", cart_count));

        return "cart";
    }

    @RequestMapping("/deleteCartOne")
    public String deleteCartOne(HttpServletRequest request , Model model){
        int cart_id = Integer.parseInt(request.getParameter("cart_id"));
        boolean b = cartDAO.deleteCartOne(cart_id);
        if(b){
            //查询订单全部信息放到前端显示
            List<Cart> cartList = cartDAO.selectCartAll();
            model.addAttribute("cartList", cartList);
            //总计
            double cart_count  = 0;
            for(Cart carts : cartList){
                cart_count += carts.getCart_num();
            }
            model.addAttribute("cart_count", String.format("%.2f", cart_count));
            return "cart";
        }else{
            return "fail";
        }

//        return "";
    }







}
