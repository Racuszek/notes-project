package com.notestore.main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/notesService")
public class NoteController {
	
	@Autowired   
	private Repository repository;
	
  @GetMapping("/display/{id}")
  public @ResponseBody String getNote(@PathVariable("id") Integer id) {
	  return repository.findById(id).get().getContent();
  }
  
  
  @PostMapping("/create}")
  public @ResponseBody String createNote(@RequestParam String title, @RequestParam String content) {
	  Note note = new Note();
	  note.setTitle(title);
	  note.setContent(content);
	  repository.save(note);
	  
	  return "OK";
  }
}