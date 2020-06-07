package ma.tiwtiw.parameter.service.impl;

import ma.tiwtiw.core.service.impl.BaseMongoTemplateServiceImpl;
import ma.tiwtiw.parameter.model.Parameter;
import ma.tiwtiw.parameter.service.ParameterService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class ParameterServiceImpl extends BaseMongoTemplateServiceImpl<Parameter, String> implements
    ParameterService {

  private final MongoTemplate mongoTemplate;

  public ParameterServiceImpl(MongoTemplate mongoTemplate) {
    super(Parameter.class);
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  protected MongoTemplate getMongoTemplate() {
    return mongoTemplate;
  }
}
