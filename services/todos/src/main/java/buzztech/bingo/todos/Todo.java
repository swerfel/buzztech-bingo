package buzztech.bingo.todos;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy=AUTO)
	private long id;
	
	private String todo;
	
	private TodoType type;
}
