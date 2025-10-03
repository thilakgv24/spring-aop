package in.thilak.spring_aop.business.service;

import org.springframework.stereotype.Service;

import in.thilak.spring_aop.business.repository.BusinessRepository;

@Service
public class BusinessService {

    private BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public int calculateSum() {
        int[] data = businessRepository.retrieveData();
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int calculateMax() {
        int[] data = businessRepository.retrieveData();
        int max = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

}
