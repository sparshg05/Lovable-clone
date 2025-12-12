package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutRequest;
import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.PortalResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
