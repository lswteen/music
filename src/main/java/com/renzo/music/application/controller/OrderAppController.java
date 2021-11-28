package com.renzo.music.application.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@Api(value="/orders", tags="ORDER API")
public class OrderAppController {

}
