package com.starter.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	
	@Id
	private String id;
	
	private String bCode;
	private String bAuth;
	private Double bCost;
	
	private List<String> codes;
	private String[] grades;
	
	private Map<String, String> forms;
	private Properties models;
	
	public Map<String, String> getForms() {
		return forms;
	}
	public void setForms(Map<String, String> forms) {
		this.forms = forms;
	}
	public Properties getModels() {
		return models;
	}
	public void setModels(Properties models) {
		this.models = models;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
	public String getbAuth() {
		return bAuth;
	}
	public void setbAuth(String bAuth) {
		this.bAuth = bAuth;
	}
	public Double getbCost() {
		return bCost;
	}
	public void setbCost(Double bCost) {
		this.bCost = bCost;
	}
	public List<String> getCodes() {
		return codes;
	}

	public Book(String bCode, String bAuth, Double bCost, List<String> codes, String[] grades,
			Map<String, String> forms, Properties models) {
		super();
		this.bCode = bCode;
		this.bAuth = bAuth;
		this.bCost = bCost;
		this.codes = codes;
		this.grades = grades;
		this.forms = forms;
		this.models = models;
	}
	public Book() {
		super();
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}
	public String[] getGrades() {
		return grades;
	}
	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	
	

}
