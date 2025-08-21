package com.lolapaluza.demo.service;

import com.lolapaluza.demo.exception.PartyAlreadyExistsException;
import com.lolapaluza.demo.exception.UnderageUserException;
import com.lolapaluza.demo.model.Festa;
import com.lolapaluza.demo.model.Pessoa;
import com.lolapaluza.demo.repository.FestaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FestaService {

    private final FestaRepository partyRepository;

    public List<Festa> findAll(){
        return partyRepository.findAll();
    }


    public Festa save(Festa party){

        verificarIdade(party.getPessoas());
        partyExist(party.getName());

        return partyRepository.save(party);
    }


    public void partyExist(String name){
        try{
            boolean existe = partyExistsByName(name);
            if(existe){
                throw new PartyAlreadyExistsException("Festa ja existe"+name);
            }
        }catch (PartyAlreadyExistsException e){
            throw new PartyAlreadyExistsException("Festa ja existe"+e.getCause());
        }
    }

    public boolean partyExistsByName(String name){
        return partyRepository.existsByName(name);
    }

    public void verificarIdade(List<Pessoa> usuarios){
        try {
            for(Pessoa u:usuarios) {
                if (u.getIdade() < 18) {
                    throw new UnderageUserException("Menor de idade" + u.getIdade());
                }
            }
        }catch (UnderageUserException e){
            throw new UnderageUserException("Menor de idade" +e.getCause());
        }
    }



}
