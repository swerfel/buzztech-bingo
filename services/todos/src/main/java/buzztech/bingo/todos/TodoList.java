package buzztech.bingo.todos;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.AUTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class TodoList {
	@Id
	@GeneratedValue(strategy=AUTO)
	private long id;
	
	private String name;
	
	@OneToMany(cascade= ALL)
	private List<Todo> todos;
}
