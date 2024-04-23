package pl.rlnkoo.memegeneratorspringapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rlnkoo.memegeneratorspringapp.models.MemeItem;
import pl.rlnkoo.memegeneratorspringapp.repositories.MemeItemRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class MemeItemService {

    @Autowired
    private MemeItemRepository memeItemRepository;

    public Iterable<MemeItem> getAll() {
        return memeItemRepository.findAll();
    }

    public Optional<MemeItem> getById(Long id) {
        return memeItemRepository.findById(id);
    }

    public MemeItem save (MemeItem memeItem) {
        if (memeItem.getId() == null) {
            memeItem.setCreatedAt(LocalDateTime.now());
        }
        memeItem.setUpdatedAt(LocalDateTime.now());
        return memeItemRepository.save(memeItem);
    }

    public void delete(Long id) {
        memeItemRepository.deleteById(id);
    }
}
