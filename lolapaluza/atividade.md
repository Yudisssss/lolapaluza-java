<p align="center">
  <a href="https://pokeapi.co/" target="blank"><img src="https://rentafont.com/uploads/76/58/27/001_bigthumb.jpg" width="400" alt="Pokemon API" /></a>
</p>

---
Criar aplicação web(API) para cadastrar e verificar a idade dos convidados de uma festa
Noturna, se for > de 18 salva a pessoa, caso não impedir o cadastro.

Dependencias -> Spring Web, H2, JPA.

PESSOA (ENTIDADE)  
criarPessoa();  
buscarPessoa(); (list)

---
### Entidades:
Pessoa{
- id (Long)
- nome (String)
- cpf (String)
- idade (Int)  
}

Festa{
- id (Long)
- nome (String)
- endereço (String)
- quantidadeDePessoas (int)  
}
---
### Camadas:

REPOSITORY  
SERVICE  
CONTROLER