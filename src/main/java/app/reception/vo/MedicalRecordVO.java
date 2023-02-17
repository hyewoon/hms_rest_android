package app.reception.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MedicalRecordVO implements Serializable  {
	private int medical_record_id, staff_id, patient_id;
	private String  record_date, record_time, record_day,record_today,
					treatment_date, prescription_name,from, to,
					treatment_name, admission, memo, patient, doctor, department_name ; 

}
