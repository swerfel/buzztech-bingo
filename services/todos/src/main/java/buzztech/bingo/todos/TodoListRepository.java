package buzztech.bingo.todos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface TodoListRepository  extends PagingAndSortingRepository<TodoList, Long>{
	TodoList findByName(@Param("name") String name);
	
}
