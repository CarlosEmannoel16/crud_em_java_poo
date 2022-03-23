
package Controller;

import DAO.DaoFactory;
import Model.Aluno;
import java.util.List;


public class AlunoController {
    
    
    
    public Aluno salvarAluno(Aluno aluno){
        DaoFactory.getAlunoDao().addAluno(aluno);
        return aluno;
    }
    
    public List<Aluno> listar(){
        return DaoFactory.getAlunoDao().listarTodosAlunos();
    }
    
    public Integer deletarAluno(Integer id){
        DaoFactory.getAlunoDao().deletarAluno(id);
        return id;
    }
    
    public Integer atualizarAluno(Aluno aluno, Integer id){
        
        Integer resultado;
        
        Integer resultadoReridicacao = DaoFactory.getAlunoDao().verificarSeExiste(id);
        if(resultadoReridicacao == 1){
            DaoFactory.getAlunoDao().AtualizarDadosDoAluno(aluno, id);
            resultado = 1;
        }else{
            resultado = 0;
        }
        

        
        return resultado;
    }
    
    
    public List<Aluno> buscar(String buscaDoALuno){
     List<Aluno> alunos;
    return DaoFactory.getAlunoDao().buscarAlunoPorNome(buscaDoALuno);
    
     
    }
    
}
