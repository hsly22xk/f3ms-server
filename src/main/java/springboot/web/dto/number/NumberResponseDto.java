package springboot.web.dto.number;
import springboot.domain.number.Number;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class NumberResponseDto {
    //정보를 리턴할 응답(Response) DTO 클래스

    private Long id;

    private int number_id;

    private Date start_date; //기수 프로젝트 시작일

    private Date end_date; //기수 프로젝트 종료일

    private String comment; //기수 특이사항

    private Boolean is_closed; //기수 종료여부 진행시 = true

    private LocalDateTime created_date;

    private LocalDateTime updated_date;

    public NumberResponseDto(Number entity){
        this.id = entity.getId();
        this.number_id = entity.getNumber_id();
        this.start_date = entity.getStart_date();
        this.end_date = entity.getEnd_date();
        this.comment = entity.getComment();
        this.is_closed = entity.getIs_closed();
        this.created_date = entity.getCreated_date();
        this.updated_date = entity.getUpdated_date();

    }
}