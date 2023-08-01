package by.pvt.hw3.mapping;

import by.pvt.hw3.domain.Good;
import by.pvt.hw3.dto.GoodRequest;
import by.pvt.hw3.dto.GoodResponse;
import by.pvt.hw3.repository.GoodRepository;


public class GoodMapping {

    public GoodResponse responseGood(Good good) {
        GoodResponse goodResponse = new GoodResponse(good.getName(), good.getId(), good.getType(),
                good.getPrice(), good.getCode());
        return goodResponse;
    }

    public Good requestGood(GoodRequest goodRequest) {
        GoodRepository goodRepository = new GoodRepository();
        return goodRepository.findIDGood(goodRequest.getId());
    }
}
