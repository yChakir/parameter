package ma.tiwtiw.parameter.service;

import ma.tiwtiw.core.service.BaseService;
import ma.tiwtiw.parameter.model.Parameter;

public interface ParameterService extends BaseService<Parameter, String> {

  Parameter findByCode(String code);
}
