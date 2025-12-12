package com.example.springProjects.Lovable_clone.service.impl;

import com.example.springProjects.Lovable_clone.dto.auth.UserProfileResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.PlanLimitsResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.UsageTodayResponse;
import com.example.springProjects.Lovable_clone.service.UsageService;
import com.example.springProjects.Lovable_clone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
