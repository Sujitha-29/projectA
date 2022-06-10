package com.chainsys.springproject.beans;

public class Movie {
	public String title;
	public String director;
	public Movie(String flimtitle, String flimdirector )
	{
		//this.title=title;
		title=flimtitle;
		director=flimdirector;	
		System.out.println(title);
		System.out.println(director);
	}

}












        //this.title=title; // this.title is global variable, and title is a local variable
		//title=flimtitle;// this is similar to this.title=flimtitle, but using this. prefix is not compulsory
		//director=flimdirector;// this is similar to this.director, but using this. prefix is not compulsory
		// as there are no local variables by name title, or director 
		// so,here they will implicitly refer to global variables
		// Note: if title and director are not globally declare then it will be undeclared variable cannot be be resolved to a variables
		// if the parameter names are similar to the global variables
		// the there is an ambiguity b/w the local variables(parameters) and global variables
		// hence this. prefix is used for referring the global variables
		// title=title will be referring the local variables on both side of the = operator(x=x) self assigning