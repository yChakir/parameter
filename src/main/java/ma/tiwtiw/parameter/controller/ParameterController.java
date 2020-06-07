package ma.tiwtiw.parameter.controller;

import ma.tiwtiw.core.controller.impl.BaseRestController;
import ma.tiwtiw.parameter.dto.ParameterDto;
import ma.tiwtiw.parameter.model.Parameter;
import ma.tiwtiw.parameter.service.ParameterService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parameters")
public class ParameterController extends BaseRestController<Parameter, ParameterDto, String> {

  private final ParameterService parameterService;

  private final ModelMapper modelMapper;

  public ParameterController(ParameterService parameterService,
      ModelMapper modelMapper) {
    super(Parameter.class, ParameterDto.class);
    this.parameterService = parameterService;
    this.modelMapper = modelMapper;
  }

  @Override
  protected ParameterService getService() {
    return parameterService;
  }

  @Override
  protected ModelMapper getMapper() {
    return modelMapper;
  }
}
