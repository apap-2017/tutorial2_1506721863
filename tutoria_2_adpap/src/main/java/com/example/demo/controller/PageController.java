package com.example.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController
{
	@RequestMapping("/hello")
	public String hello ()
	{
		return "hello";
	}
	
	@RequestMapping("/greeting")
	public String greeting (@RequestParam(value = "name", required = false, defaultValue = "dunia") String name, Model model)
	{
		model.addAttribute ("name", name);
		return "greeting";
	}
	
	@RequestMapping(value = {"/greeting", "greeting/{name}"})
	public String greetingPath (@PathVariable Optional<String> name, Model model)
	{
		if (name.isPresent())
		{
			model.addAttribute("name", name.get());
		} else {
			model.addAttribute("name", "dengklek");
		}
		return "greeting";
	}
	
	@RequestMapping(value = {"/multiply", "multiply/{ab}"})
	public String multiply (@PathVariable Optional<String> ab, Model model)
	{
		/*
		 * logic saya adalah user memasukkan angka yang ingin dikalikan
		 * dalam method ini dibuat kondisi if-else mulai dari jika hanya ada satu angka, ada dua, dan lebih dari dua angka
		 * jika ada satu angka, disimpan sebagai a dan dikalikan dengan nilai default
		 * jika ada dua angka, dengan menggunakan modulo diambil a dan b lalu dikalikan
		 * hasil perkalian disimpan dalam variabel result
		 */
	}
}
