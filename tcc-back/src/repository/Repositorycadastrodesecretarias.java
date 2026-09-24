package repository;

import java.util.List;

public class Cadastrodesecretarias{

@Repository
public class CadastroRepository {

    private List<cadastrodesecretarias> listaCadastrodesecretarias;

    public PokemonRepository(List<cadastrodesecretarias> listacadastrodesecretarias) {
        this.listacadastrodesecretarias = listacadastrodesecretarias;
    }


    public Repositorycadastrodesecretarias buscarcadastrodesecretarias() {

        return new cadastrodesecretarias(
                "Pikachu",
                "Elétrico"
        );

    }

    public String addcadastrodesecretarias;
    Cadastrodesecretarias repositorycadastrodesecretarias;{
        this.listacadastrodesecretarias.add(Cadastrodesecretarias);

        return "Deu certo!";
    }

    public List<cadastrodesecretarias> getLista(){
        return this.listacadastrodesecretarias;
    }


    public String updatecadastrodesecretarias(String nome, cadastrodesecretarias cadastroAtualizado) {
        for (cadastrodesecretarias cadastro : listacadastrodesecretarias) {
            // Compara o nome ignorando maiúsculas/minúsculas
            if (cadastro.getNome().equalsIgnoreCase(nome)) {

                // Opção 1: Atualiza os dados do objeto existente (Recomendado)
                cadastro.setNome(cadastrodesecretarias.getNome());
                cadastro.setTipo(cadastrodesecretarias.getTipo());

                return "Cadastro realizado com sucesso!";
            }
        }
        return "Pokémon não encontrado.";
    }



}

}