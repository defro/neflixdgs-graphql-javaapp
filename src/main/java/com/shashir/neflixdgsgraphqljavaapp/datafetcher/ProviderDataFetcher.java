package com.shashir.neflixdgsgraphqljavaapp.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsMutation;
import com.shashir.neflixdgsgraphqljavaapp.model.*;
import com.shashir.neflixdgsgraphqljavaapp.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class ProviderDataFetcher {

    @Autowired
    ProviderRepository providerRepository;

    @DgsData(parentType = "Query", field = "providers")
    public List<Provider> providers() {
        return providerRepository.findAll();
    }

    @DgsMutation
    public Provider provider(ProviderInput providerInput) {
        Provider provider = Provider.builder()
                .name(providerInput.getName())
                .build();
        Provider providerResponse = providerRepository.save(provider);
        return providerResponse;
    }
}
