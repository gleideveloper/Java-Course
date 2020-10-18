package exercicio_de_fixacao.model.services;

import exercicio_de_fixacao.model.entities.Contract;
import exercicio_de_fixacao.model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService() {
    }

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        //BasicQuota = 200
        for (int i = 1; i <= months; i++) {
            double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            //updateQuota  = 202;
            double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
            //fullQuota = 206.04
            Date dueDate = addMounths(contract.getDate(),i);
            contract.getInstallments().add(new Installment(dueDate,fullQuota));
        }
    }

    private Date addMounths(Date date, int qtyMounths){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,qtyMounths);
        return calendar.getTime();
    }
}
