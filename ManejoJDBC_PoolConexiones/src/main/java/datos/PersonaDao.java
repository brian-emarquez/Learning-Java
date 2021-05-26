package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDao {
    
    public List<PersonaDTO> select() throws SQLException;
    
    public int insert(PersonaDTO persona) throws SQLException;
    
    public int update(PersonaDTO persona) throws SQLException;
    
    public int delete(PersonaDTO persona) throws SQLException;
}
