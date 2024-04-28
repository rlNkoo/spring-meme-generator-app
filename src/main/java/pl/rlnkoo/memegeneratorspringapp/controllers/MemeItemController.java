package pl.rlnkoo.memegeneratorspringapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rlnkoo.memegeneratorspringapp.models.MemeItem;
import pl.rlnkoo.memegeneratorspringapp.services.MemeItemService;

@RestController
@RequestMapping("/api/meme-items")
public class MemeItemController {

    @Autowired
    private MemeItemService memeItemService;

    @GetMapping("")
    public Iterable<MemeItem> getMemeItems() {
        return memeItemService.getAll();
    }
}
