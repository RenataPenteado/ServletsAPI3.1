/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2demo;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Renata
 */
public class ProductAction extends ActionSupport {
    private Product productBean;

    public Product getProductBean() {
        return productBean;
    }

    public void setProductBean(Product productBean) {
        this.productBean = productBean;
    }

    @Override
    public String execute() throws Exception {
        //call Service class to store productBean's state in database
        return "success";
    }
    
}
