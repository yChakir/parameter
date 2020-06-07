package ma.tiwtiw.parameter.service.impl;

import ma.tiwtiw.core.exception.ResourceNotFoundException;
import ma.tiwtiw.core.service.impl.BaseMongoTemplateServiceImpl;
import ma.tiwtiw.parameter.model.Parameter;
import ma.tiwtiw.parameter.service.ParameterService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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

  @Override
  public Parameter findByCode(String code) {
    Query query = new Query();
    query.addCriteria(new Criteria("code").is(code));

    final Parameter parameter = getMongoTemplate().findOne(query, Parameter.class);

    if (parameter == null) {
      throw new ResourceNotFoundException();
    }

    return parameter;
  }
}
