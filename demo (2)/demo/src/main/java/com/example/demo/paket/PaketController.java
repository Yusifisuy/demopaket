package com.example.demo.paket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/paket")
public class PaketController {
    private final PaketService paketservice;


    public PaketController(PaketService paketservice) {
        this.paketservice = paketservice;
    }

    @GetMapping
    public List<SearchResultDto> Getpaket(){
        return paketservice.Getpaket();
    }
    @PostMapping
    public SearchResultDto registerNew(@RequestBody Paket paket){

        return paketservice.addNew(paket);

    }
}
