package bootwildfly.controllers;

import bootwildfly.models.Company;
import bootwildfly.models.CompanyDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Controller
public class UserController {

  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  /**
   * /create  --> Create a new user and save it in the database.
   * 
   * @param email User's email
   * @param name User's name
   * @return A string describing if the user is succesfully created or not.
   */
  @RequestMapping("/create")
  @ResponseBody
  public String create(String email, String name) {
    Company company = null;
    try {
      company = new Company(email, name);
      companyDao.save(user);
    }
    catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }
    return "Company succesfully created! (id = " + company.getId() + ")";
  }
  
  
  /**
   * /get-by-email  --> Return the id for the user having the passed email.
   * 
   * @param email The email to search in the database.
   * @return The user id or a message error if the user is not found.
   */
  @RequestMapping("/get-by-name")
  @ResponseBody
  public String getByEmail(String name) {
    String userId;
    try {
      Company company = companyDao.findByName(name);
      userId = String.valueOf(company.getId());
    }
    catch (Exception ex) {
      return "User not found";
    }
    return "The company id is: " + userId;
  }
  
 
  @Autowired
  private CompanyDao companyDao;
  
} // class UserController
