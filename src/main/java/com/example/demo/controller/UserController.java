package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

 @Controller 
 public class UserController {
  
  @Autowired private UserService userService;
  
  @GetMapping("/users") 
  public String listUsers(Model model) {
  System.out.println("Calling the list of the user methods :=");
  model.addAttribute("users", userService.getAllUsers()); 
  return "index"; 
  } 
  }
  

/*
 * @Controller
 * 
 * @RequestMapping("/users") public class UserController {
 * 
 * 
 * @Autowired private UserService service;
 * 
 * 
 * public UserController(UserService service) { this.service = service; }
 * 
 * // READ: list all users
 * 
 * @GetMapping public String listUsers(Model model) {
 * model.addAttribute("users", service.getAllUsers()); return "users"; // JSP
 * page name }
 * 
 * // CREATE: show form
 * 
 * @GetMapping("/new") public String showCreateForm(Model model) {
 * model.addAttribute("user", new User()); return "createUser"; }
 * 
 * @PostMapping public String createUser(@ModelAttribute User user) {
 * service.saveUser(user); return "redirect:/users"; }
 * 
 * // READ: view single user
 * 
 * @GetMapping("/{id}") public String viewUser(@PathVariable int id, Model
 * model) { model.addAttribute("user", service.getUserById(id)); return
 * "viewUser"; }
 * 
 * // UPDATE: show edit form
 * 
 * @GetMapping("/edit/{id}") public String showEditForm(@PathVariable int id,
 * Model model) { model.addAttribute("user", service.getUserById(id)); return
 * "editUser"; }
 * 
 * @PostMapping("/update") public String updateUser(@ModelAttribute User user) {
 * service.saveUser(user); return "redirect:/users"; }
 * 
 * // DELETE
 * 
 * @GetMapping("/delete/{id}") public String deleteUser(@PathVariable int id) {
 * service.deleteUser(id); return "redirect:/users"; } }
 */