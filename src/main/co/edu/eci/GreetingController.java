package co.edu.eci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/catalan")
    public String catalan(@RequestParam(value = "n", defaultValue = "0") int n) {
        return String.valueOf(catalanNumber(n));
    }

    private long catalanNumber(int n) {
        long res = 1;

        for (int i = 0; i < n; i++) {
            res = res * 2 * (2 * i + 1) / (i + 2);
        }

        return res;
    }
}
