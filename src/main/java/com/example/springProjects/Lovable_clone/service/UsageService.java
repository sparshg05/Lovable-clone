package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.subscription.PlanLimitsResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
