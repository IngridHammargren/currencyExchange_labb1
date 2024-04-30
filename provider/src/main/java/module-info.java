import com.example.providers.USD;
import com.example.providers.EUR;
import com.example.providers.GBP;
import com.example.service.currencyExchange;

module provider {
    requires service;
    provides currencyExchange with USD, EUR, GBP;

}