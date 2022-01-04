import com.google.inject.Guice;
import com.google.inject.Injector;
import core.PageInit;
import core.Pages;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    Pages pages;

    @BeforeEach
    public void configureEnvironment() {
        injectPages();
    }

    private void injectPages() {
        Injector injector = Guice.createInjector(new PageInit());
        pages = injector.getInstance(Pages.class);
    }
}
