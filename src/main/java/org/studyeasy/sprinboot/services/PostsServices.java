package org.studyeasy.sprinboot.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.sprinboot.entity.Post;
import org.studyeasy.sprinboot.repository.PostRepository;
@Service
public class PostsServices {
	@Autowired
	private PostRepository repo;
	public List<Post> getPosts(){
	 List<Post> list=new ArrayList<Post>();
	 list.add(new Post());

		for(Post post:repo.findAll())
		{
			list.add(post);
		}
		return list;
	}
	public Post getPost(int id) {
	return repo.findById(id).get();
	}
	
	public void addPost(Post listElement) {
		// TODO Auto-generated method stub
		repo.save(listElement);
	}
	
	public void updatePost(Post post, int id) {
		repo.save(post);
	}
	public void deletePost(int id) {
		repo.deleteById(id);
	}
}
