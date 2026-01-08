package com.example.springProjects.Lovable_clone.service.impl;

import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutRequest;
import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.PortalResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.SubscriptionResponse;
import com.example.springProjects.Lovable_clone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }
}
