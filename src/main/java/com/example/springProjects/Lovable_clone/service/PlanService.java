package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
