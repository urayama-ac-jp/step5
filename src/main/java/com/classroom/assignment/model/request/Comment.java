package com.classroom.assignment.model.request;

public class Comment {

  private String name;
  private String content;
  private String mail;

  public Comment(String name, String content, String mail) {
    this.setName(name);
    this.setContent(content);
    this.setMail(mail);
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
