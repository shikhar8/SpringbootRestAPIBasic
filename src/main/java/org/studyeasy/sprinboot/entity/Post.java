package org.studyeasy.sprinboot.entity;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@Column(name="id")
	int PostId;
	@Column(name="title")
	String title;
	@Column(name="body")
	String body;
	public Post(int postId, String title, String body) {
		PostId = postId;
		this.title = title;
		this.body = body;
	}
	public Post() {
		
	}
	public int getPostId() {
		return PostId;
	}
	public void setPostId(int postId) {
		PostId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Post [PostId=" + PostId + ", title=" + title + ", body=" + body + "]";
	}
	
}
