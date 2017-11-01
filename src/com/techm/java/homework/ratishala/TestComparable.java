package com.techm.java.homework.ratishala;

import java.util.*;  
import java.io.*;  
public class TestComparable{  
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(0,"Vijay",23));  
al.add(new Student(06,"Ajay",27));  
al.add(new Student(05,"Jai",2));  
  
Collections.sort(al);  
for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  
 

