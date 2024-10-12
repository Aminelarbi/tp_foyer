package tn.esprit.tp_foyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.Repository.ReservationRepository;
import tn.esprit.tp_foyer.entity.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepository reservationRepository;

    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    public Reservation addReservation(Reservation c) {
        return reservationRepository.save(c);
    }

    public void removeReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    public Reservation modifyReservation(Reservation foyer) {
        return reservationRepository.save(foyer);
    }
}