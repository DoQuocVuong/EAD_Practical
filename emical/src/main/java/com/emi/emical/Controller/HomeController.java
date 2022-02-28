package com.emi.emical.Controller;
import com.emi.emical.Model.Loan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/emi")
public class HomeController {
    @RequestMapping(method = RequestMethod.POST, path = "totalLoan")
    public ResponseEntity<?> calculateLoan(@RequestBody Loan loan) {
        double final_loan = loan.getLoan();
        double rate = loan.getRate() / 100;
        double term = loan.getTerm();
        double totalLoan = final_loan * rate * (Math.pow((1 + rate), term) / (Math.pow((1 + rate), term) - 1)) * 1 / 12;
        return new ResponseEntity<>(totalLoan, HttpStatus.OK);
    }
}
