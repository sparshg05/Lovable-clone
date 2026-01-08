package com.example.springProjects.Lovable_clone.service.impl;

import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutRequest;
import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.PortalResponse;
import com.example.springProjects.Lovable_clone.repository.PlanRepository;
import com.example.springProjects.Lovable_clone.security.AuthUtil;
import com.example.springProjects.Lovable_clone.service.PaymentProcessor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class StripePaymentProcessor implements PaymentProcessor {
    AuthUtil authUtil;
    PlanRepository planRepository;

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request) {
        Long userId = authUtil.getCurrentUserId();


        return null;
    }

    @Override
    public PortalResponse openCustomerPortal() {
        return null;
    }
}
