package com.itsc.PinPointer.domains;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FirebaseDocument("/facility_votes")
public class FacilityVote {

    @FirebaseId
    private String id;

    private String facilityId;

    private String phoneNumber;

}
