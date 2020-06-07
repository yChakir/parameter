package ma.tiwtiw.parameter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.dto.BaseDto;
import ma.tiwtiw.parameter.model.Parameter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ParameterDto extends BaseDto<Parameter, String> {

  private String code;

  private String description;

  private String stringValue;

  private Long longValue;

  private Double doubleValue;

  private Boolean booleanValue;

  private Object objectValue;

  private byte[] bytesValue;
}
