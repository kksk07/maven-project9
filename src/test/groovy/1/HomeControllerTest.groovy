package 1

import org.junit.Before
import org.junit.Test

class HomeControllerTest {

    HomeController controller

    @Before
    void createController() {
        controller = new HomeController()
    }

    @Test
    void indexShouldReturnCorrectViewName() {
        assert controller.index() == "index"
    }
}
