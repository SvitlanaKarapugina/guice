package core;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import pages.CartPage;
import pages.MainPage;
import pages.ProductDetailsPage;

public class PageInit extends AbstractModule {
    @Override
    protected void configure() {
        bind(MainPage.class);
        bind(CartPage.class);
        bind(ProductDetailsPage.class).in(Scopes.SINGLETON);
    }
}
