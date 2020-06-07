package ma.tiwtiw.parameter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.model.BaseModel;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Parameter extends BaseModel<String> {

  @Indexed(unique = true)
  private String code;

  private String description;

  private String stringValue;

  private Long longValue;

  private Double doubleValue;

  private Boolean booleanValue;

  private Object objectValue;

  private byte[] bytesValue;
}
