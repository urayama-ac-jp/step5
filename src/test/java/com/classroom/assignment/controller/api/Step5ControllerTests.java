package com.classroom.assignment.controller.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.classroom.assignment.controller.Step5Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
class Step5ControllerTests {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private Step5Controller controller;

  @Test
  void contextLoads() {
    // given
    // when
    // then
    assertThat(controller).isNotNull();
  }

  @Test
  public void classFactorSpecifiedHasConfirm() throws Exception {
    // given
    // when
    // then
    MvcResult result = mockMvc.perform(get("/step5")).andExpect(status().isOk())
        .andReturn();
    String content = result.getResponse().getContentAsString();
    assertThat(content).contains("table-stripe");
  }

}
