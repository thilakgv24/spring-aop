package in.thilak.spring_aop.business.repository;

import org.springframework.stereotype.Repository;

import in.thilak.spring_aop.annotations.TrackTime;

@Repository
public class BusinessRepository {

    @TrackTime
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }

}
