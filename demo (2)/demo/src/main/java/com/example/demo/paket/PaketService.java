package com.example.demo.paket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaketService {

    private final PaketRepository paketrepository;
    @Autowired
    public PaketService(PaketRepository paketrepository) {
        this.paketrepository = paketrepository;
    }

    public List<SearchResultDto> Getpaket(){
        List<Paket> paketList =  paketrepository.findAll();
        List<SearchResultDto> searchResultDtos =  new ArrayList<>();

        for (Paket paket : paketList) {

            SearchResultDto searchResultDto = new SearchResultDto();
            searchResultDto.setId(paket.getId());
            searchResultDtos.add(searchResultDto);

        }
        return searchResultDtos;

        }


    public SearchResultDto addNew(Paket paket) {
        Paket paket1 =
         paketrepository.save(paket);
         SearchResultDto searchResultDto = new SearchResultDto();
         searchResultDto.setId(paket.getId());
         return searchResultDto;
    }
}
