package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client {
@Id
private String id;
private String nom;
private String prenom;
private String email;
private String codeClient;
private String password;
@DBRef
private  List<Account> accounts=new ArrayList<Account>();

public Client(String id, String nom, String prenom, String email, String codeClient, String password,
		List<Account> accounts) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.codeClient = codeClient;
	this.password = password;
	this.accounts = accounts;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Account> getAccounts() {
	return accounts;
}
public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
}
public String getCodeClient() {
	return codeClient;
}
public void setCodeClient(String codeClient) {
	this.codeClient = codeClient;
}



}
